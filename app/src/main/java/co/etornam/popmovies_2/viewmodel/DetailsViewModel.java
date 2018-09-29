package co.etornam.popmovies_2.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import co.etornam.popmovies_2.database.FavouriteMovies;
import co.etornam.popmovies_2.database.MovieDatabase;

public class DetailsViewModel extends ViewModel {

    private LiveData<FavouriteMovies> favouriteMovies;

    DetailsViewModel(MovieDatabase database, int id) {
        favouriteMovies = database.favouriteMoviesDao().loadFavouriteMovieById(id);
    }

    public LiveData<FavouriteMovies> getFavouriteMovies() {
        return favouriteMovies;
    }
}
