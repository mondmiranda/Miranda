package com.example.myapplication

class MainActivity2  : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        findViewById<Button>(R.id.button1).setOnClickListener { button1() }
        findViewById<Button>(R.id.button2).setOnClickListener { button2() }
        findViewById<Button>(R.id.button3).setOnClickListener { button3() }
        findViewById(R.id.toast_button4) as Button



        }



private fun button1() {
        val uri = Uri.parse("content:/contact")
        val intent2 = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent2)
        }

private fun button2() {
        val google = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
        startActivity(google)

        }

private fun button3() {
        val facebook = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"))
        startActivity(facebook)
        }
}
