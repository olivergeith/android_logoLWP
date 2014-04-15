package de.geithonline.logolwp;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

public class BattNumberPreferencesFragment extends PreferenceFragment {
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_batt_number);
		enableProFeatures();
	}

	private void enableProFeatures() {
		final Preference showNumber = findPreference("show_number");
		showNumber.setEnabled(true);

		final Preference showStatus = findPreference("show_status");
		showStatus.setEnabled(true);

	}

}
