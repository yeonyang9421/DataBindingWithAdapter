package kr.co.woobi.imyeon.databindwithadapter;

import android.databinding.BindingAdapter;
import android.media.Image;
import android.widget.ImageView;

public class BindingAdapterUtil {
    @BindingAdapter("photo")
    public static void showPhoto(ImageView view, int url){

        view.setImageResource(url);

    }

}
