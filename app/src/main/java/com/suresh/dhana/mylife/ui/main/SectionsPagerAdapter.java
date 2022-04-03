package com.suresh.dhana.mylife.ui.main;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.suresh.dhana.mylife.Exercise_fragment;
import com.suresh.dhana.mylife.Exercise_fragment1;
import com.suresh.dhana.mylife.MainActivity;
import com.suresh.dhana.mylife.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

	@StringRes
	private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
	private final Context mContext;

	public SectionsPagerAdapter(Context context, FragmentManager fm)
	{
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position)
	{
		Fragment fragment = null;

		switch (position)
		{
			case 0:
				fragment = new Exercise_fragment();
				break;
			case 1:
				fragment = new Exercise_fragment1();
				break;

		}
		return fragment;
	}

	@Nullable
	@Override
	public CharSequence getPageTitle(int position)
	{
		return mContext.getResources().getString(TAB_TITLES[position]);
	}

	@Override
	public int getCount()
	{
		// Show 2 total pages.
		return 2;
	}
}