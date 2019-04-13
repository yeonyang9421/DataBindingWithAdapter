package kr.co.woobi.imyeon.databindwithadapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.co.woobi.imyeon.databindwithadapter.databinding.ItemPhotoBinding;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {
    List<PhotoModel> mItem = new ArrayList<>();

    public PhotoAdapter(List<PhotoModel> mItem) {
        this.mItem = mItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_photo, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        PhotoModel photoModel = mItem.get(i);

        viewHolder.binding.setPhoto(photoModel); //이미지는 왜 안오는 걸까? 할 수 없이 아래 한 줄 더 써줘야한다.
//        viewHolder.binding.imagePhoto.setImageResource(photoModel.getImage());

/*
        viewHolder.binding.imagePhoto.setImageResource(mItem.get(i).getImage());
        viewHolder.binding.textTitle.setText(mItem.get(i).getTitle());
*/
    }

    @Override
    public int getItemCount() {
        return mItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemPhotoBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
}
