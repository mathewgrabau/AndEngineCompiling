package ca.mathewgrabau.andengineproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.andengine.engine.options.EngineOptions;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.activity.BaseGameActivity;

import java.io.IOException;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends BaseGameActivity {

    // These were just all flagged as being required to run things.
    // Either way at least there is now a working implementation here. Can carry this forward to
    // try to compile other projects now.
    @Override
    public EngineOptions onCreateEngineOptions() {
        return null;
    }

    @Override
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) {

    }

    @Override
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) {

    }

    @Override
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
