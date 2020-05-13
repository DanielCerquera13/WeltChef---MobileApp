package appmoviles.com.weltchef.control.viewcontrollers;

import android.content.Intent;
import android.view.View;

import appmoviles.com.weltchef.R;
import appmoviles.com.weltchef.view.RegisterActivity;
import appmoviles.com.weltchef.view.RegisterChefActivity;

public class RegisterController implements View.OnClickListener {

    private RegisterActivity activity;

    public RegisterController(RegisterActivity activity) {
        this.activity = activity;
        init();
    }

    private void init() {
        activity.getChefBtn().setOnClickListener(this);
        activity.getClientBtn().setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chefBtn:
                Intent intent = new Intent(activity, RegisterChefActivity.class);
                String name =  (String) activity.getIntent().getExtras().get("name");
                String email =  (String) activity.getIntent().getExtras().get("email");
                String phone =  (String) activity.getIntent().getExtras().get("phone");
                intent.putExtra("facebookLogin", (Boolean) activity.getIntent().getExtras().get("facebookLogin"));

                intent.putExtra("name",name != null ? name : "");
                intent.putExtra("email",email != null ? email : "");
                intent.putExtra("phone", phone != null ? phone : "");
                activity.startActivity(intent);
                activity.finish();
                break;

            case R.id.clientBtn:
                //Intent i = new Intent(activity, )
                break;



        }

    }
}
