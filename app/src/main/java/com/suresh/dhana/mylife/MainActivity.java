package com.suresh.dhana.mylife;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.suresh.dhana.mylife.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity implements View.OnClickListener 
{

	private AppBarConfiguration mAppBarConfiguration;
	private ActivityMainBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
//----------------------------------------action bar code------------------------------------------------------------
		binding = ActivityMainBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setVisibility(View.INVISIBLE);
		DrawerLayout drawer = binding.drawerLayout;
		NavigationView navigationView = binding.navView;
		// Passing each menu ID as a set of Ids because each
		// menu should be considered as top level destinations.
		mAppBarConfiguration = new AppBarConfiguration.Builder(
				R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
				.setOpenableLayout(drawer)
				.build();
		NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
		NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
		NavigationUI.setupWithNavController(navigationView, navController);

		//-----------------------------------------end of action bar----------------------------------------------------
		findViewById(R.id.meditationId).setOnClickListener(this);
		findViewById(R.id.GymId).setOnClickListener(this);
		findViewById(R.id.NotificationId).setOnClickListener(this);
		findViewById(R.id.timerId).setOnClickListener(this);
		findViewById(R.id.skillsId).setOnClickListener(this);
		findViewById(R.id.todoId).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onSupportNavigateUp()
	{
		NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
		return NavigationUI.navigateUp(navController, mAppBarConfiguration)
				|| super.onSupportNavigateUp();
	}

	@Override
	public void onClick(View view) 
	{
		if(view.getId() == R.id.meditationId)
		{
			//Do something Like starting an activity
			//Intent intent = new Intent(MyActivity.this, NextActivity.class);
			//startActivity(intent);

			Toast.makeText(getApplicationContext(),"meditation",Toast.LENGTH_SHORT).show();

		}

		if(view.getId() == R.id.GymId)
		{
			//Do something Like starting an activity
			//Intent intent = new Intent(MyActivity.this, NextActivity.class);
			//startActivity(intent);

			Toast.makeText(getApplicationContext(),"gym",Toast.LENGTH_SHORT).show();
		}

		if(view.getId() == R.id.NotificationId)
		{
			//Do something Like starting an activity
			//Intent intent = new Intent(MyActivity.this, NextActivity.class);
			//startActivity(intent);

			Toast.makeText(getApplicationContext(),"notifications",Toast.LENGTH_SHORT).show();
		}

		if(view.getId() == R.id.timerId)
		{
			//Do something Like starting an activity
			//Intent intent = new Intent(MyActivity.this, NextActivity.class);
			//startActivity(intent);

			Toast.makeText(getApplicationContext(),"timer",Toast.LENGTH_SHORT).show();
		}

		if(view.getId() == R.id.skillsId)
		{
			//Do something Like starting an activity
			//Intent intent = new Intent(MyActivity.this, NextActivity.class);
			//startActivity(intent);

			Toast.makeText(getApplicationContext(),"skills",Toast.LENGTH_SHORT).show();
		}

		if(view.getId() == R.id.todoId)
		{
			//Do something Like starting an activity
			//Intent intent = new Intent(MyActivity.this, NextActivity.class);
			//startActivity(intent);

			Toast.makeText(getApplicationContext(),"todo",Toast.LENGTH_SHORT).show();
		}
	}
}