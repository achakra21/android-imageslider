package imageslider.demo.com.imageslider;

/**
 * Created by UBN on 06-02-2017.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AndroidImageAdapter extends PagerAdapter {
    Context mContext;

    AndroidImageAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return sliderImagesId.length;
    }

   /* private int[] sliderImagesId = new int[]{
            R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,
            R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher,
    };*/
    private String[] sliderImagesId = new String[]{
           "https://www.zdoof.com//zdoof-admin/dish/dish-image/PI846994889.png", "https://www.zdoof.com//zdoof-admin/dish/dish-image/PI846994889.png", "https://www.zdoof.com//zdoof-admin/dish/dish-image/PI846994889.png",
            "https://www.zdoof.com//zdoof-admin/dish/dish-image/PI846994889.png", "https://www.zdoof.com//zdoof-admin/dish/dish-image/PI846994889.png", "https://www.zdoof.com//zdoof-admin/dish/dish-image/PI846994889.png",
    };

    @Override
    public boolean isViewFromObject(View v, Object obj) {
        return v == ((ImageView) obj);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int i) {
        ImageView mImageView = new ImageView(mContext);
        mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Picasso.with(AndroidImageSlider.context).load(sliderImagesId[i]).into(mImageView);
        //mImageView.setImageResource(sliderImagesId[i]);
        ((ViewPager) container).addView(mImageView, 0);
        return mImageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int i, Object obj) {
        ((ViewPager) container).removeView((ImageView) obj);
    }
}
