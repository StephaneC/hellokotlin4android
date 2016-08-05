package stephane.castrec.hellokotlin4android

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //private var  editTxt: EditText?
    //private var  txt: TextView?

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //No need because Kotlin extension plugin
        // txt = findViewById(R.id.txt) as TextView?;
        // editTxt = findViewById(R.id.edittxt) as EditText?;

        findViewById(R.id.btn_snack).setOnClickListener {
            snack();
        }
        findViewById(R.id.btn_toast).setOnClickListener {
            toast();
        }
        findViewById(R.id.btn_txt).setOnClickListener {
            textView();
        }
    }

    fun snack(){
        Snackbar.make(layout, edittxt.text.toString(), Snackbar.LENGTH_LONG).show()
    }

    fun textView(){
        txt.setText(edittxt.text.toString())
    }

    fun toast(){
        Toast.makeText(this, edittxt.text.toString(), Toast.LENGTH_LONG).show()
    }
}
