package com.prabha.player.Setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.prabha.player.R;
import com.prabha.player.Services.AlbumsArtDownloadService;
import com.prabha.player.Services.ArtistArtDownloadService;

/**
 * Created by Prabha Raj on 8/16/2018.
 */

public class SettingsAlbumArtFragment extends PreferenceFragment {

    private View mRootView;
    private Context mContext;
    private Preference mArtistArtPreference;
    private Preference mAlbumArtPreference;
    private PreferenceManager mPreferenceManager;

    @Override
    public void onCreate(Bundle onSavedInstanceState) {
        super.onCreate(onSavedInstanceState);
        addPreferencesFromResource(R.xml.settings_album_art);
        ((SettingActivity) getActivity()).setToolbarTitle(getString(R.string.album_and_artist_art));
        mPreferenceManager = getPreferenceManager();

        mArtistArtPreference = mPreferenceManager.findPreference("preference_key_artist_art");
        mAlbumArtPreference = mPreferenceManager.findPreference("preference_key_download_album_art");

        mArtistArtPreference.setOnPreferenceClickListener(preference -> {
            getActivity().startService(new Intent(getActivity(), ArtistArtDownloadService.class));
            return false;
        });

        mAlbumArtPreference.setOnPreferenceClickListener(preference -> {
            getActivity().startService(new Intent(getActivity(), AlbumsArtDownloadService.class));
            return false;
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle onSavedInstanceState) {
        mRootView = super.onCreateView(inflater, container, onSavedInstanceState);
        mContext = getActivity().getApplicationContext();
        return mRootView;
    }

}
