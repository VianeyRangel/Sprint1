package mx.edu.utng.vgutierrez.videodolores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import in.goodiebag.carouselpicker.CarouselPicker;

public class HandicraftsActivity extends AppCompatActivity {
    CarouselPicker carouselPicker1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handicrafts);

        carouselPicker1 = (CarouselPicker)findViewById(R.id.carouselPicker1);

        //Carousel 1 with image and text
        List<CarouselPicker.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new CarouselPicker.TextItem("Rangel",20));
        mixItems.add(new CarouselPicker.DrawableItem(R.drawable.crafts1));
        mixItems.add(new CarouselPicker.TextItem("Dolores",20));
        mixItems.add(new CarouselPicker.DrawableItem(R.drawable.crafts2));
        CarouselPicker.CarouselViewAdapter mixAdapter = new CarouselPicker.CarouselViewAdapter(this,mixItems,0);
        carouselPicker1.setAdapter(mixAdapter);

    }
}
