package com.example.abhishek.trichyguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PlacesFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PlacesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PlacesFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public PlacesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment PlacesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PlacesFragment newInstance() {
        PlacesFragment fragment = new PlacesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        //Creating and populating list
        ArrayList<GuideItem> hotels = new ArrayList<GuideItem>();
        hotels.add(new GuideItem(getString(R.string.ranga),getString(R.string.rangaAdd),getString(R.string.rangaDesc),R.drawable.ranga));
        hotels.add(new GuideItem(getString(R.string.rock),getString(R.string.rockAdd),getString(R.string.rockDesc),R.drawable.rockfort));
        hotels.add(new GuideItem(getString(R.string.dam),getString(R.string.damAdd),getString(R.string.damDesc),R.drawable.kallanai));
        hotels.add(new GuideItem(getString(R.string.jambu),getString(R.string.jambuAdd),getString(R.string.jambuDesc),R.drawable.jambu));
        hotels.add(new GuideItem(getString(R.string.church),getString(R.string.churchAd),getString(R.string.churchDesc),R.drawable.church));
        hotels.add(new GuideItem(getString(R.string.science),getString(R.string.scienceAdd),getString(R.string.scienceDesc),R.drawable.science_centre));

        //Hooking up the adapter
        GuideItemAdapter adapter = new GuideItemAdapter(getActivity(),hotels);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
