package com.livingwordsolutions.technosoft.post_module_location;

import android.app.Activity;
import android.os.Bundle;


public class location extends Activity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

      /* Use the LocationManager class to obtain GPS locations *//*
        LocationManager mlocManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        LocationListener mlocListener = new MyLocationListener();
        mlocManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, mlocListener);*/
    }

   /* *//* Class My Location Listener *//*
    public class MyLocationListener implements LocationListener
    {

        @Override
        public void onLocationChanged(Location loc)
        {

            loc.getLatitude();
            loc.getLongitude();

            String Text = "My current location is: " +
                    "Latitud = " + loc.getLatitude() +
                    "Longitud = " + loc.getLongitude();

            TextView tv = (TextView) findViewById(R.id.tt);
            tv.setText(Text);

        }

        @Override
        public void onProviderDisabled(String provider)
        {
            //Toast.makeText( getApplicationContext(), "Gps Disabled", Toast.LENGTH_SHORT ).show();
        }

        @Override
        public void onProviderEnabled(String provider)
        {
            //Toast.makeText( getApplicationContext(), "Gps Enabled", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras)
        {

        }
    }*/
}
