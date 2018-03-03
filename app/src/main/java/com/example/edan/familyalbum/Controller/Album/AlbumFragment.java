package com.example.edan.familyalbum.Controller.Album;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.edan.familyalbum.Controller.MainActivity;
import com.example.edan.familyalbum.Entities.Album;
import com.example.edan.familyalbum.R;


public class AlbumFragment extends Fragment {
    private Album album;

    public static AlbumFragment newInstance(Album album) {
        AlbumFragment albumFragment = new AlbumFragment();
        albumFragment.album = album;
        return albumFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_album, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).showAlbumsFragment();
            }
        });
        view.findViewById(R.id.btn_comments).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //((MainActivity) getActivity()).showCommentsFragment(album);
            }
        });

        GridView gridview = (GridView) view.findViewById(R.id.gridview);
        gridview.setAdapter(new AlbumGridAdapter(getContext()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getContext(), "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });


        //album.getImages()
    }

}
