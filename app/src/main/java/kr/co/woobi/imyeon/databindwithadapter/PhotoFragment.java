package kr.co.woobi.imyeon.databindwithadapter;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import kr.co.woobi.imyeon.databindwithadapter.databinding.FragmentPhotoBindingBinding;

public class PhotoFragment extends Fragment {
    private FragmentPhotoBindingBinding mBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view=inflater.inflate(R.layout.fragment_photo_binding,container,false);
        mBinding= DataBindingUtil.inflate(inflater, R.layout.fragment_photo_binding,container,false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        RecyclerView recyclerView=view.findViewById(R.id.recycler);

        List<PhotoModel> modelList = new ArrayList<>();
        modelList.add(0, new PhotoModel(R.drawable.movie1, "Final Score"));
        modelList.add(1, new PhotoModel(R.drawable.movie2, "First Man"));
        modelList.add(2, new PhotoModel(R.drawable.movie3, "Funny Girl"));
        modelList.add(3, new PhotoModel(R.drawable.movie4, "Grans"));
        modelList.add(4, new PhotoModel(R.drawable.image1, "군도"));
        modelList.add(5, new PhotoModel(R.drawable.image2, "공조"));
        modelList.add(6, new PhotoModel(R.drawable.image3, "더킹"));
        modelList.add(7, new PhotoModel(R.drawable.image4, "레지던트이블"));
        modelList.add(8, new PhotoModel(R.drawable.image5, "럭키"));

        PhotoAdapter adapter=new PhotoAdapter(modelList);
        mBinding.recycler.setAdapter(adapter);



    }
}
