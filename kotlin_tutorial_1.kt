class MainActivity : AppCompatActivity(){
  override fun oncreate(){
    ...

    val btn = findviewbyid(R.id.button) as Button
    val mytextView = findviewbyid(R.id.textView) as TextView
    var timesClicked = 0

    btn.setOnClickListner{
      timesClicked += 1
      mytextView.text = timesClicked.toString()
      Toast.makeText(this,"Button clicked",Toast.LENGTH).show()
    }
  }
}

//above code can be further easier to use
class MainActivity : AppCompatActivity(){
  override fun oncreate(){
    ...

    var timesClicked = 0

    button.setOnClickListner{
      timesClicked += 1
      textView.text = timesClicked.toString()
      Toast.makeText(this,"Button clicked",Toast.LENGTH).show()
    }
  }
}
