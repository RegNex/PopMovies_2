package co.etornam.popmovies_2.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.etornam.popmovies_2.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import co.etornam.popmovies_2.adapters.FavouriteMoviesAdapter;
import co.etornam.popmovies_2.database.FavouriteMovies;
import co.etornam.popmovies_2.database.MovieDatabase;
import co.etornam.popmovies_2.viewmodel.FavouritesViewModel;

public class FavouriteActivity extends AppCompatActivity implements FavouriteMoviesAdapter.ListItemClickListener {

    @BindView(R.id.fav_recycler_view)
    RecyclerView recyclerView;

    MovieDatabase mDatabase;
    FavouriteMoviesAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        setTitle(getString(R.string.favourite_activity_label));
        ButterKnife.bind(this);

        mDatabase = MovieDatabase.getInstance(this);

        populateUI();
        setupViewModels();
    }

    /**
     * Setups {@link RecyclerView}, the layout and attaches the
     * FavouriteMoviesAdapter to it.
     */
    private void populateUI() {
        mAdapter = new FavouriteMoviesAdapter(this, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    public void onListItemClick(FavouriteMovies favouriteMovies) {
        Bundle extras = new Bundle();
        Intent intent = new Intent(this, DetailsActivity.class);
        extras.putInt(getString(R.string.extra_favourite_movie), favouriteMovies.getId());
        extras.putInt(getString(R.string.fav_extra_id), favouriteMovies.getMovieId());
        intent.putExtras(extras);
        startActivity(intent);
    }

    /**
     * Creates the ViewModels for this activity
     */
    private void setupViewModels() {
        FavouritesViewModel viewModel = ViewModelProviders.of(this).get(FavouritesViewModel.class);
        viewModel.getFavouriteMovies().observe(this, new Observer<List<FavouriteMovies>>() {
            @Override
            public void onChanged(@Nullable List<FavouriteMovies> favouriteMovies) {
                mAdapter.setFavouriteMoviesList(favouriteMovies);
            }
        });
    }
}
