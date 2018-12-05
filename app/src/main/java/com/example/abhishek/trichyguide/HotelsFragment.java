package com.example.abhishek.trichyguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HotelsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HotelsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HotelsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public HotelsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment AboutFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HotelsFragment newInstance() {
        HotelsFragment fragment = new HotelsFragment();
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
        hotels.add(new GuideItem(getString(R.string.ramyas),getString(R.string.ramyasAdd),getString(R.string.ramyasDesc),R.drawable.ramyas));
        hotels.add(new GuideItem(getString(R.string.vijey),getString(R.string.vijeyAdd),getString(R.string.vijeyDesc),R.drawable.vijey_hotels));
        hotels.add(new GuideItem(getString(R.string.femina),getString(R.string.feminaAdd),getString(R.string.feminaDesc),R.drawable.femina_hotel));
        hotels.add(new GuideItem(getString(R.string.red),getString(R.string.redAdd),getString(R.string.redDesc),R.drawable.redfox));
        hotels.add(new GuideItem(getString(R.string.sangam),getString(R.string.sangamAd),getString(R.string.sangamDesc),R.drawable.sangam));
        hotels.add(new GuideItem(getString(R.string.srm),getString(R.string.srmAdd),getString(R.string.srmDesc),R.drawable.srm));
        hotels.add(new GuideItem(getString(R.string.grand),getString(R.string.grandadd),getString(R.string.grandDesc),R.drawable.grand));

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
