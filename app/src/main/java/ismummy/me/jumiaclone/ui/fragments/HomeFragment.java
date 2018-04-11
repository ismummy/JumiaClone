package ismummy.me.jumiaclone.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.OnClick;
import ismummy.me.jumiaclone.R;
import ismummy.me.jumiaclone.ui.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends BaseFragment {


    public static HomeFragment newInstance(){
        return  new HomeFragment();
    }
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @OnClick(R.id.iv_banner)
    void bannerClicked(){
        toast("banner Clicked");
    }
    @OnClick(R.id.layout_express)
    void expressClicked(){
        toast("Express clicked");
    }

    @OnClick(R.id.layout_entertainment)
    void entertainmentClicked()
    {
        toast("entertainment Clicked");
    }
    @OnClick(R.id.layout_phones)
    void phonesClicked(){
        toast("Phones CLicked");
    }
    @OnClick(R.id.layout_power)
    void powerClicked(){
        toast("Powerup Clicked");
    }
    @OnClick(R.id.layout_deal)
    void dealClicked(){
        toast("Deals Clicked");
    }
    @OnClick(R.id.layout_hair)
    void hairClicked(){
        toast("Hair Clicked");
    }
    @OnClick(R.id.layout_household)
    void householdClicked(){
        toast("Household Clicked");
    }
    @OnClick(R.id.layout_formen)
    void formenClicked()
    {
        toast("For men Clicked");
    }
    @OnClick(R.id.iv_hp_shop)
    void hpShopClicked(){
        toast("Hp Shop Clicked");
    }
    @OnClick(R.id.iv_intel_shop)
    void intelShopClicked(){
        toast("Intel Shop Clicked");
    }
    @OnClick(R.id.iv_molfix_shop)
    void molfixShopClicked(){
        toast("Molfix Shop Clicked");
    }
    @OnClick(R.id.iv_canon_shop)
    void canonShopClicked(){
        toast("Canon shop clicked");
    }
    @OnClick(R.id.iv_infinix_shop)
    void infinixShopClicked(){
        toast("Infinix Shop Clicked");
    }
    @OnClick(R.id.iv_innjo_shop)
    void innjoShopClicked(){
        toast("Innjo Shop Clicked");
    }
    @OnClick(R.id.iv_tecno_shop)
    void tecnoShopClicked(){
        toast("Tecno Shop Clicked");
    }
    @OnClick(R.id.iv_home_deal)
    void homeDealClicked(){
        toast("Home Deal Clicked");
    }
    @OnClick(R.id.iv_voucher_deal)
    void voucherDealClicked()
    {
        toast("Voucher Deal Clicked");
    }

    @OnClick(R.id.layout_phones_store)
    void phonesStoreClicked(){
        toast("phones Stores Clicked");
    }
    @OnClick(R.id.layout_baby_store)
    void babyStoreClicked(){
        toast("Baby Store Clicked");
    }
    @OnClick(R.id.layout_computing_store)
    void computingStoreClicked()
    {
        toast("Computing Store Clicked");
    }
    @OnClick(R.id.layout_electronic_store)
    void electronicStoreClicked(){
        toast("Electronic Store Clicked");
    }
    @OnClick(R.id.layout_home_store)
    void homeStoreClicked(){
        toast("Home and Office Store Clicked");
    }
    @OnClick(R.id.layout_men_clothing_store)
    void menClothingStoreClicked()
    {
        toast("Men Clothing Store Clicked");
    }
    @OnClick(R.id.layout_women_clothing_store)
    void womenClothingStoreClicked()
    {
        toast("Women Clothing Store Clicked");
    }
    @OnClick(R.id.layout_men_shoes_store)
    void menShoesStoreClicked(){
        toast("Men Shoes Store Clicked");
    }
    @OnClick(R.id.layout_women_shoes_store)
    void womenShoesStoreClicked(){
        toast("Women Shoes Store Clicked");
    }
    @OnClick(R.id.layout_health_store)
    void healthStoreClicked(){
        toast("Health and Beauty Store Clicked");
    }
}
