package co.etornam.popmovies_2.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import co.etornam.popmovies_2.helper.MovieRepository;
import co.etornam.popmovies_2.model.TrailerResponse;
import retrofit2.Response;

public class TrailerViewModel extends ViewModel {

    private LiveData<Response<TrailerResponse>> trailerResponse;

    TrailerViewModel(String id) {
        trailerResponse = MovieRepository.getInstance().getTrailerResponse(id);
    }

    public LiveData<Response<TrailerResponse>> getTrailerResponse() {
        return trailerResponse;
    }
}
