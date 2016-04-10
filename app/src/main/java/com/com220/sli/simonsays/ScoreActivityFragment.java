package com.com220.sli.simonsays;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ScoreActivityFragment extends Fragment {

    int hscore = 0;
    public ScoreActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Intent intent = getActivity().getIntent();
        if(intent != null && intent.hasExtra(Intent.EXTRA_TEXT))
        {
            int currScore = intent.getIntExtra("intScore", 0);

            ((TextView) rootView.findViewById(R.id.score)).setText(currScore);

        }

        return rootView;
    }

    public void checkHighScore(int currScore)
    {
        if(hscore == 0)
        {
            hscore = currScore;
        }
        else if(currScore > hscore)
        {
            hscore = currScore;
        }
        else
            return;
    }
}
