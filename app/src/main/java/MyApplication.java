import android.app.Application;
import com.vk.sdk.VKSdk;
/**
 * Created by Melo on 19.02.2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        VKSdk.initialize(Context applicationContext);
        super.onCreate();
    }
}
