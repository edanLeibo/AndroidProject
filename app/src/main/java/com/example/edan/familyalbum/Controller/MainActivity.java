package com.example.edan.familyalbum.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.edan.familyalbum.Controller.Album.CreateAlbumFragment;
import com.example.edan.familyalbum.Controller.Albums.AlbumsFragment;
import com.example.edan.familyalbum.Controller.Login.LoginFragment;
import com.example.edan.familyalbum.Entities.Album;
import com.example.edan.familyalbum.Entities.Comment;
import com.example.edan.familyalbum.Entities.Image;
import com.example.edan.familyalbum.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AlbumsFragment.OnFragmentInteractionListener {

    private List<Album> albums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillAlbumsWithDummyData();
        showLoginFragment();
    }

    private void fillAlbumsWithDummyData() {
        albums = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            List<Image> images = new ArrayList<>();
            for (int j = 0; j < Math.random() * 20; j++) {
                images.add(new Image());
            }

            List<Comment> comments = new ArrayList<>();
            for (int k = 0; k < Math.random() * 20; k++) {
                comments.add(new Comment("Comment #" + k));
            }
            albums.add(new Album("Album #" + i, "01.11.2011", images, comments));
        }
    }

    public void showLoginFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new LoginFragment())
                .commit();
    }

   public void showAlbumsFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, AlbumsFragment.newInstance(albums))
                .commit();
    }

    public void showCreateAlbumFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new CreateAlbumFragment())
                .commit();
    }


    public void showAlbumFragment() {
        showAlbumFragment(albums.get(0));
    }

    public void showAlbumFragment(Album album) {
/*        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, AlbumFragment.newInstance(album))
                .commit();*/
    }

/*
    public void showCommentsFragment(Album album) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, CommentsFragment.newInstance(album))
                .commit();
    }*/



    @Override
    public void onItemSelected(Album album) {

    }
}
