package com.example.stp_converter

import android.app.Dialog
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stp_converter.converter.Convert10p
import com.example.stp_converter.converter.Editor
import com.example.stp_converter.converter.History
import com.google.android.material.slider.Slider

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val editor = Editor()
		val convert = Convert10p()
		val history = History()

		val editText1 = findViewById<EditText>(R.id.edit1)
		editText1.inputType = InputType.TYPE_NULL
		editText1.setText(editor.number(), TextView.BufferType.EDITABLE)

		val editText2 = findViewById<EditText>(R.id.edit2)
		editText2.inputType = InputType.TYPE_NULL
		editText2.setText("", TextView.BufferType.EDITABLE)

		val slider1 = findViewById<Slider>(R.id.slide1)
		val slider2 = findViewById<Slider>(R.id.slide2)

		val st1 = findViewById<TextView>(R.id.slideText1)
		val st2 = findViewById<TextView>(R.id.slideText2)

		slider1.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
			override fun onStartTrackingTouch(slider: Slider) {
				st1.text = slider1.value.toInt().toString()
			}

			override fun onStopTrackingTouch(slider: Slider) {
				st1.text = slider1.value.toInt().toString()
				findViewById<Button>(R.id.b2).isEnabled = false
				findViewById<Button>(R.id.b3).isEnabled = false
				findViewById<Button>(R.id.b4).isEnabled = false
				findViewById<Button>(R.id.b5).isEnabled = false
				findViewById<Button>(R.id.b6).isEnabled = false
				findViewById<Button>(R.id.b7).isEnabled = false
				findViewById<Button>(R.id.b8).isEnabled = false
				findViewById<Button>(R.id.b9).isEnabled = false
				findViewById<Button>(R.id.bA).isEnabled = false
				findViewById<Button>(R.id.bB).isEnabled = false
				findViewById<Button>(R.id.bC).isEnabled = false
				findViewById<Button>(R.id.bD).isEnabled = false
				findViewById<Button>(R.id.bE).isEnabled = false
				findViewById<Button>(R.id.bF).isEnabled = false
				if (slider1.value.toInt() > 2) findViewById<Button>(R.id.b2).isEnabled = true
				if (slider1.value.toInt() > 3) findViewById<Button>(R.id.b3).isEnabled = true
				if (slider1.value.toInt() > 4) findViewById<Button>(R.id.b4).isEnabled = true
				if (slider1.value.toInt() > 5) findViewById<Button>(R.id.b5).isEnabled = true
				if (slider1.value.toInt() > 6) findViewById<Button>(R.id.b6).isEnabled = true
				if (slider1.value.toInt() > 7) findViewById<Button>(R.id.b7).isEnabled = true
				if (slider1.value.toInt() > 8) findViewById<Button>(R.id.b8).isEnabled = true
				if (slider1.value.toInt() > 9) findViewById<Button>(R.id.b9).isEnabled = true
				if (slider1.value.toInt() > 10) findViewById<Button>(R.id.bA).isEnabled = true
				if (slider1.value.toInt() > 11) findViewById<Button>(R.id.bB).isEnabled = true
				if (slider1.value.toInt() > 12) findViewById<Button>(R.id.bC).isEnabled = true
				if (slider1.value.toInt() > 13) findViewById<Button>(R.id.bD).isEnabled = true
				if (slider1.value.toInt() > 14) findViewById<Button>(R.id.bE).isEnabled = true
				if (slider1.value.toInt() > 15) findViewById<Button>(R.id.bF).isEnabled = true

			}
		})
		slider2.addOnSliderTouchListener(object : Slider.OnSliderTouchListener {
			override fun onStartTrackingTouch(slider: Slider) {
				st2.text = slider2.value.toInt().toString()
			}

			override fun onStopTrackingTouch(slider: Slider) {
				st2.text = slider2.value.toInt().toString()
			}
		})

		findViewById<Button>(R.id.b0).setOnClickListener {
			editor.addDigit('0')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b1).setOnClickListener {
			editor.addDigit('1')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b2).setOnClickListener {
			editor.addDigit('2')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b3).setOnClickListener {
			editor.addDigit('3')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b4).setOnClickListener {
			editor.addDigit('4')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b5).setOnClickListener {
			editor.addDigit('5')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b6).setOnClickListener {
			editor.addDigit('6')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b7).setOnClickListener {
			editor.addDigit('7')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b8).setOnClickListener {
			editor.addDigit('8')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.b9).setOnClickListener {
			editor.addDigit('9')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bA).setOnClickListener {
			editor.addDigit('A')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bB).setOnClickListener {
			editor.addDigit('B')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bC).setOnClickListener {
			editor.addDigit('C')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bD).setOnClickListener {
			editor.addDigit('D')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bE).setOnClickListener {
			editor.addDigit('E')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bF).setOnClickListener {
			editor.addDigit('F')
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bClr).setOnClickListener {
			editor.clear()
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bDel).setOnClickListener {
			editor.delete()
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}
		findViewById<Button>(R.id.bDot).setOnClickListener {
			editor.addDelim()
			editText1.setText(editor.number(), TextView.BufferType.EDITABLE)
		}

		findViewById<Button>(R.id.bEx).setOnClickListener {
			val a = convert.dval(editText1.text.toString(), slider1.value.toInt())
			val b = convert.doConvert(a, slider2.value.toInt(), 5)
			editText2.setText(b, TextView.BufferType.EDITABLE)
			history.addRecord(slider1.value.toInt(), slider2.value.toInt(), editText1.text.toString(), b)
		}
		findViewById<Button>(R.id.bHis).setOnClickListener {
			val dialog = Dialog(this@MainActivity)

			dialog.setTitle("Заголовок диалога")
			dialog.setContentView(R.layout.dialog_view)

			val rw = dialog.findViewById<RecyclerView>(R.id.rv)
			rw.layoutManager = LinearLayoutManager(dialog.context)
			rw.adapter = RWAdapter(history.history())

			dialog.show()
		}
	}


}