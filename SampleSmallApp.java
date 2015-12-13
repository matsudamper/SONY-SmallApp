import com.sony.smallapp.SmallAppWindow;
import com.sony.smallapp.SmallApplication;

public class SampleSmallApp extends SmallApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        setContentView(R.layout.main);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}