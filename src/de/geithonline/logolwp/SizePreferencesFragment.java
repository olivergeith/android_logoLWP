package de.geithonline.logolwp;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SizePreferencesFragment extends PreferenceFragment {
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_size);
		enableProFeatures();
	}

	private void enableProFeatures() {
		// final Preference showStatus = findPreference("show_status");
		// if (Settings.isPremium()) {
		// showStatus.setEnabled(true);
		// } else {
		// Settings.prefs.edit().putBoolean("show_status", false).commit();
		// showStatus.setEnabled(false);
		// showStatus.setSummary("Premium Version only");
		// }

	}

}
