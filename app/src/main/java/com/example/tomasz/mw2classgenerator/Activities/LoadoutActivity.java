package com.example.tomasz.mw2classgenerator.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tomasz.mw2classgenerator.Constants;
import com.example.tomasz.mw2classgenerator.Loadouts.Loadout;
import com.example.tomasz.mw2classgenerator.Loadouts.WeaponStore;
import com.example.tomasz.mw2classgenerator.R;


public class LoadoutActivity extends Activity {

    private Loadout loadout;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadout);

        Intent input = getIntent();

        int level = input.getIntExtra(Constants.LEVEL, 70);
        int type = input.getIntExtra(Constants.TYPE, Constants.TYPE_RANDOM);

        getViews();

        loadout = new Loadout(new WeaponStore(level));
        applyLoadout();

    }

    private void getViews() {
        primaryText = (TextView) findViewById(R.id.primary_weapon);
        secondaryText = (TextView) findViewById(R.id.secondary_weapon);
        equipmentText = (TextView) findViewById(R.id.equipment);
        specialText = (TextView) findViewById(R.id.special);
        deathstreakText = (TextView) findViewById(R.id.deathstreak);
        ks1Title = (TextView) findViewById(R.id.ks_1_title);
        k1Kills = (TextView) findViewById(R.id.ks_1_kills);
        ks2Title = (TextView) findViewById(R.id.ks_2_title);
        k2Kills = (TextView) findViewById(R.id.ks_2_kills);
        ks3Title = (TextView) findViewById(R.id.ks_3_title);
        k3Kills = (TextView) findViewById(R.id.ks_3_kills);

        primaryImg = (ImageView) findViewById(R.id.primary_weapon_img);
        primaryAttachment1 = (ImageView) findViewById(R.id.primary_weapon_attachment_1);
        primaryAttachment2 = (ImageView) findViewById(R.id.primary_weapon_attachment_2);
        secondaryImg = (ImageView) findViewById(R.id.secondary_weapon_img);
        secondaryAttachment1 = (ImageView) findViewById(R.id.secondary_weapon_attachment_1);
        secondaryAttachment2 = (ImageView) findViewById(R.id.secondary_weapon_attachment_2);
        perk1 = (ImageView) findViewById(R.id.perk1);
        perk2 = (ImageView) findViewById(R.id.perk2);
        perk3 = (ImageView) findViewById(R.id.perk3);
        k1 = (ImageView) findViewById(R.id.ks_1_img);
        k2 = (ImageView) findViewById(R.id.ks_2_img);
        k3 = (ImageView) findViewById(R.id.ks_3_img);
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
