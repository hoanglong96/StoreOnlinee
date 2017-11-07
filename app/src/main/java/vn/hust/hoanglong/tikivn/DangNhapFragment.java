package vn.hust.hoanglong.tikivn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class DangNhapFragment extends Fragment {

    EditText etEmail,etPass;
//    ImageView ivClear;
//    TextView tvHide;
//    boolean VISIBLE_PASS = false;

    public DangNhapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dang_nhap, container, false);
        setupUI(view);
        return view;
    }

    private void setupUI(View view) {

        etEmail = view.findViewById(R.id.et_email);
        etPass = view.findViewById(R.id.et_password);
//        tvHide = view.findViewById(R.id.tv_hide_pass);
//        rlPass = view.findViewById(R.id.rl2);



//        ivClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                etEmail2.setText("");
//            }
//        });


//        tvHide.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(VISIBLE_PASS){
//                    etPass2.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
//                    tvHide.setText("Hiện");
//                    VISIBLE_PASS = false;
//                }else{
//                    etPass2.setInputType(InputType.TYPE_CLASS_TEXT);
//                    tvHide.setText("Ẩn");
//                    VISIBLE_PASS = true;
//                }
//            }
//        });
    }
}
