package imageslider.demo.com.imageslider;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;


import android.support.v4.view.ViewPager;



import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;


import static android.provider.MediaStore.Images.Thumbnails.HEIGHT;

public class AndroidImageSlider extends Activity {
    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_image_slider_activity);
        context = this;
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);

        AndroidImageAdapter adapterView = new AndroidImageAdapter(this);
        mViewPager.setAdapter(adapterView);

        ImageButton imageButton = (ImageButton)findViewById(R.id.btnClose);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageButton imageButton1 = (ImageButton)findViewById(R.id.btnMaximise);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Gets linearlayout
                LinearLayout layout = (LinearLayout)findViewById(R.id.imageSlider);
                layout.getLayoutParams().height = 1200;

                layout.requestLayout();

            }
        });

        ImageButton imageButton2 = (ImageButton)findViewById(R.id.btnMinimise);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout layout = (LinearLayout)findViewById(R.id.imageSlider);
                layout.getLayoutParams().height = 750;

                layout.requestLayout();
            }
        });

    }

}
