package jokesbutandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jokesbutandroidlib.R;

public class JokesActivityFragment extends Fragment {

    public JokesActivityFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_jokes_activity, container, false);
        Intent i = getActivity().getIntent();

        String gce_result = getActivity().getIntent().getStringExtra("gce_result");
        TextView gce_result_show = (TextView) v.findViewById(R.id.jokes_text_view);
        gce_result_show.setText(gce_result);

        return v;
    }

}
