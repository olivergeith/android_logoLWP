package de.geithonline.logolwp;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import de.geithonline.logolwp.settings.Settings;

public class BattStatusPreferencesFragment extends PreferenceFragment {
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_batt_status);
		enableProFeatures();
	}

	private void enableProFeatures() {
		final Preference showStatus = findPreference("show_status");
		if (Settings.isPremium()) {
			showStatus.setEnabled(true);
		} else {
			Settings.prefs.edit().putBoolean("show_status", false).commit();
			showStatus.setEnabled(false);
			showStatus.setSummary("Premium Version only");
		}

	}

}
