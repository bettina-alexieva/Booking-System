package info.androidhive.tabsswipe.adapter;

import info.androidhive.tabsswipe.Fragment2;
import info.androidhive.tabsswipe.Fragment3;
import info.androidhive.tabsswipe.Fragment1;
import info.androidhive.tabsswipe.WelcomeFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {

		case 0:
			// Welcome Fragment
			return new WelcomeFragment();
		case 1:
			// Fragment 1
			return new Fragment1();
		case 2:
			// Fragment 2
			return new Fragment2();
		case 3:
			// Fragment 3
			return new Fragment3();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}
}
