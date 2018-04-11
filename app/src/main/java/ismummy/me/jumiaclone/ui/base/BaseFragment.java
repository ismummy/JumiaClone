package ismummy.me.jumiaclone.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import butterknife.ButterKnife;
import ismummy.me.jumiaclone.listeners.FragmentLifeCycle;

/**
 * Custome Base Fragment. with helping methods
 */

@SuppressWarnings("ALL")
public abstract class BaseFragment extends Fragment implements FragmentLifeCycle {

    private volatile boolean isOn = false;

    @Override
    public void onPause() {
        super.onPause();
        isOn = false;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    public void onResume() {
        super.onResume();
        isOn = true;
    }

    protected void toast(String message) {
        if (!isOn || isDetached())
            return;

        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }

    protected void toastNetwork() {
        if (!isOn || isDetached())
            return;
        toast("Check your internet connection and Try again!!!");
    }

    protected void toastConnectionFailure() {
        if (!isOn || isDetached())
        return;
        toast("Error response from remote server. Please retry!!!");
    }

    @Override
    public void onPauseFragment() {
        //Util.hideKeyboard(getActivity());
    }

    @Override
    public void onResumeFragment() {

    }

}
