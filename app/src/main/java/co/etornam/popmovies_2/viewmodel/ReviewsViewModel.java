package co.etornam.popmovies_2.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import co.etornam.popmovies_2.helper.MovieRepository;
import co.etornam.popmovies_2.model.ReviewResponse;
import retrofit2.Response;

public class ReviewsViewModel extends ViewModel {

    private LiveData<Response<ReviewResponse>> reviewResponse;

    ReviewsViewModel(String id, int currentPage) {
        reviewResponse = MovieRepository.getInstance().getReviewResponse(id, currentPage);
    }

    public LiveData<Response<ReviewResponse>> getReviewResponse() {
        return reviewResponse;
    }
}
