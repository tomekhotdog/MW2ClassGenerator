package com.example.tomasz.mw2classgenerator.Activities;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tomasz.mw2classgenerator.Constants;
import com.example.tomasz.mw2classgenerator.Loadouts.Loadout;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStores.AttackingWeaponStore;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStores.DefensiveWeaponStore;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStores.WackyWeaponStore;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStores.WeaponStore;
import com.example.tomasz.mw2classgenerator.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LoadoutFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LoadoutFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class LoadoutFragment extends Fragment {

    private int loadoutType = 100;
    private OnFragmentInteractionListener mListener;

    private Activity activity;

    private Loadout loadout;
    private int level = 70;

    private TextView primaryText;
    private TextView secondaryText;
    private TextView equipmentText;
    private TextView specialText;
    private TextView deathstreakText;
    private TextView ks1Title;
    private TextView ks2Title;
    private TextView ks3Title;
    private TextView k1Kills;
    private TextView k2Kills;
    private TextView k3Kills;

    private ImageView primaryImg;
    private ImageView primaryAttachment1;
    private ImageView primaryAttachment2;
    private ImageView secondaryImg;
    private ImageView secondaryAttachment1;
    private ImageView secondaryAttachment2;
    private ImageView perk1;
    private ImageView perk2;
    private ImageView perk3;
    private ImageView k1;
    private ImageView k2;
    private ImageView k3;

    public static LoadoutFragment newInstance(int loadoutType) {
        LoadoutFragment fragment = new LoadoutFragment();
        Bundle args = new Bundle();
        args.putInt(Constants.TYPE, loadoutType);
        fragment.setArguments(args);
        return fragment;
    }
    public LoadoutFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            loadoutType = getArguments().getInt(Constants.TYPE);
        }
        //TODO: how to get level ? dialog box?
        switch(loadoutType) {
            case Constants.TYPE_RANDOM:
                loadout = new Loadout(new WeaponStore(level));
                break;
            case Constants.TYPE_AGGRESSIVE:
                loadout = new Loadout(new AttackingWeaponStore(level));
                break;
            case Constants.TYPE_DEFENSIVE:
                loadout = new Loadout(new DefensiveWeaponStore(level));
                break;
            case Constants.TYPE_WACKY:
                loadout = new Loadout(new WackyWeaponStore(level));
                break;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       return inflater.inflate(R.layout.activity_loadout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getViews();
        applyLoadout();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = activity;
        ((HomeActivity) activity).onSectionAttached(getArguments().getInt(Constants.TYPE));
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
        public void onFragmentInteraction(Uri uri);
    }

    public void randomise(View v) {
        loadout.randomise();
        applyLoadout();
    }

    private void getViews() {
        primaryText = (TextView) getView().findViewById(R.id.primary_weapon);
        secondaryText = (TextView) getView().findViewById(R.id.secondary_weapon);
        equipmentText = (TextView) activity.findViewById(R.id.equipment);
        specialText = (TextView) activity.findViewById(R.id.special);
        deathstreakText = (TextView) activity.findViewById(R.id.deathstreak);
        ks1Title = (TextView) activity.findViewById(R.id.ks_1_title);
        k1Kills = (TextView) activity.findViewById(R.id.ks_1_kills);
        ks2Title = (TextView) activity.findViewById(R.id.ks_2_title);
        k2Kills = (TextView) activity.findViewById(R.id.ks_2_kills);
        ks3Title = (TextView) activity.findViewById(R.id.ks_3_title);
        k3Kills = (TextView) activity.findViewById(R.id.ks_3_kills);

        primaryImg = (ImageView) activity.findViewById(R.id.primary_weapon_img);
        primaryAttachment1 = (ImageView) activity.findViewById(R.id.primary_weapon_attachment_1);
        primaryAttachment2 = (ImageView) activity.findViewById(R.id.primary_weapon_attachment_2);
        secondaryImg = (ImageView) activity.findViewById(R.id.secondary_weapon_img);
        secondaryAttachment1 = (ImageView) activity.findViewById(R.id.secondary_weapon_attachment_1);
        secondaryAttachment2 = (ImageView) activity.findViewById(R.id.secondary_weapon_attachment_2);
        perk1 = (ImageView) activity.findViewById(R.id.perk1);
        perk2 = (ImageView) activity.findViewById(R.id.perk2);
        perk3 = (ImageView) activity.findViewById(R.id.perk3);
        k1 = (ImageView) activity.findViewById(R.id.ks_1_img);
        k2 = (ImageView) activity.findViewById(R.id.ks_2_img);
        k3 = (ImageView) activity.findViewById(R.id.ks_3_img);
    }

    private void applyLoadout() {
        //TODO: logic to switch between type;

        primaryText.setText(loadout.getPrimaryWeapon().getName());
        secondaryText.setText(loadout.getSecondaryWeapon().getName());
        equipmentText.setText(loadout.getEquipment().getName());
        specialText.setText(loadout.getSpecialGrenade().getName());
        deathstreakText.setText(loadout.getDeathStreak().getName());
        ks1Title.setText(loadout.getKillstreakLoadout().getKillStreak(1).getName());
        ks2Title.setText(loadout.getKillstreakLoadout().getKillStreak(2).getName());
        ks3Title.setText(loadout.getKillstreakLoadout().getKillStreak(3).getName());
        k1Kills.setText(String.valueOf(loadout.getKillstreakLoadout().getKillStreak(1).getKillsRequired()) + " Kills");
        k2Kills.setText(String.valueOf(loadout.getKillstreakLoadout().getKillStreak(2).getKillsRequired()) + " Kills");
        k3Kills.setText(String.valueOf(loadout.getKillstreakLoadout().getKillStreak(3).getKillsRequired()) + " Kills");

        primaryImg.setImageResource(loadout.getPrimaryWeapon().getImageResource());
        primaryAttachment1.setImageResource(loadout.getPrimaryAttachment1().getImageResource());

        if(loadout.getPrimaryAttachment2() != null) {
            primaryAttachment2.setImageResource(loadout.getPrimaryAttachment2().getImageResource());
        } else {
            primaryAttachment2.setVisibility(View.GONE);
        }

        secondaryImg.setImageResource(loadout.getSecondaryWeapon().getImageResource());

        if(loadout.getSecondaryAttachment1() != null) {
            secondaryAttachment1.setImageResource(loadout.getSecondaryAttachment1().getImageResource());
        } else {
            secondaryAttachment1.setVisibility(View.GONE);
        }
        if(loadout.getPrimaryAttachment2() != null) {
            secondaryAttachment2.setImageResource(loadout.getSecondaryAttachment2().getImageResource());
        } else {
            secondaryAttachment2.setVisibility(View.GONE);
        }

        perk1.setImageResource(loadout.getPerkLoadout().getPerk(1).getImageResource());
        perk2.setImageResource(loadout.getPerkLoadout().getPerk(2).getImageResource());
        perk3.setImageResource(loadout.getPerkLoadout().getPerk(3).getImageResource());
        k1.setImageResource(loadout.getKillstreakLoadout().getKillStreak(1).getImageResource());
        k2.setImageResource(loadout.getKillstreakLoadout().getKillStreak(2).getImageResource());
        k3.setImageResource(loadout.getKillstreakLoadout().getKillStreak(3).getImageResource());

    }

}
