package com.com220.sli.simonsays;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeActivityFragment extends Fragment {

    private Button play, viewscore, exit;
    public HomeActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        play = (Button) rootView.findViewById(R.id.play);
        viewscore = (Button) rootView.findViewById(R.id.viewscore);
        exit = (Button) rootView.findViewById(R.id.exit);

        play.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });

        viewscore.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getActivity(), ScoreActivityFragment.class);
                startActivity(intent);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                getActivity().finish();
            }
        });

        return rootView;


    }
}
