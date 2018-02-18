import android.app.Application;
import com.vk.sdk.VKSdk;
/**
 * Created by Melo on 19.02.2018.
 */

public class ApiConstants extends Application{
    public static final String[] DEFAULT_LOGIN_SCOPE = {};

    @Override
    public void onCreate() {
        VKSdk.login(this, ApiConstants.DEFAULT_LOGIN_SCOPE);
        super.onCreate();
    }
}
