package ismummy.me.jumiaclone.ui.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.OnClick;
import ismummy.me.jumiaclone.R;
import ismummy.me.jumiaclone.ui.adapters.MainActivityAdapter;
import ismummy.me.jumiaclone.ui.base.BaseActivity;
import ismummy.me.jumiaclone.ui.fragments.HomeFragment;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.drawer_layout_main)
    DrawerLayout mDrawerLayout;

    private MainActivityAdapter adapter;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViewPager();
        setupDrawer();
    }

    private void setupDrawer() {
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayShowTitleEnabled(true);
        mDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, toolbar, R.string.app_name, R.string.app_name);

        mDrawerLayout.addDrawerListener(mDrawerToggle);
        mDrawerToggle.syncState();
    }

    private void setupViewPager() {
        adapter = new MainActivityAdapter(getSupportFragmentManager());
        adapter.addFragment(HomeFragment.newInstance());
        adapter.addFragment(HomeFragment.newInstance());
        adapter.addFragment(HomeFragment.newInstance());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_saved);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_action_cart);
    }

    @OnClick(R.id.layout_drawer_travel)
    void travelDrawerClicked(){
        toast("Travel Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
    @OnClick(R.id.layout_drawer_food)
    void foodDrawerClicked(){
        toast("Food Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
    @OnClick(R.id.layout_drawer_deals)
    void dealDrawerClicked()
    {
        toast("Deal Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
    @OnClick(R.id.layout_drawer_house)
    void houseDrawerClicked(){
        toast("House Drawer Clicked");
    }
    @OnClick(R.id.layout_drawer_car)
    void carDrawerClicked()
    {
        toast("Car Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
    @OnClick(R.id.layout_drawer_one)
    void oneDrawerClicked()
    {
        toast("One Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
    @OnClick(R.id.layout_drawer_market)
    void marketDrawerClicked()
    {
        toast("Market Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
    @OnClick(R.id.layout_drawer_flight)
    void flightDrawerClicked()
    {
        toast("Fligh Drawer Clicked");
        mDrawerLayout.closeDrawers();
    }
}
