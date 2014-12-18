package com.example.tomasz.mw2classgenerator.Activities;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;

import com.example.tomasz.mw2classgenerator.Constants;
import com.example.tomasz.mw2classgenerator.R;
import com.example.tomasz.mw2classgenerator.Utils.UtilityMethods;


public class HomeActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks, LoadoutFragment.OnFragmentInteractionListener {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        //startLoadoutActivity();
    }

    public void startLoadoutActivity() {
        //Just testing
        Intent i = new Intent(this, LoadoutActivity.class);
        i.putExtra(Constants.TYPE, Constants.TYPE_RANDOM);
        i.putExtra(Constants.LEVEL, 70);
        startActivity(i);
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                //.replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .replace(R.id.container, LoadoutFragment.newInstance(UtilityMethods.getLoadoutType(position)), Constants.CURRENT_FRAGMENT)
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case Constants.TYPE_RANDOM:
                mTitle = getString(R.string.random_loadout);
                break;
            case Constants.TYPE_AGGRESSIVE:
                mTitle = getString(R.string.aggressive_loadout);
                break;
            case Constants.TYPE_DEFENSIVE:
                mTitle = getString(R.string.defensive_loadout);
                break;
            case Constants.TYPE_WACKY:
                mTitle = getString(R.string.wacky_loadout);
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.home, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        //TODO: null to enable it to work
    }

    public void randomise(View v) {
        Fragment currentFragment = getFragmentManager().findFragmentByTag(Constants.CURRENT_FRAGMENT);
        ((LoadoutFragment) currentFragment).randomise(v);
//        loadout.randomise();
//        applyLoadout();
    }

}
