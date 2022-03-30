package com.example.stp_converter.converter

class Editor {

	private var number = "0"

	fun addDigit(digit: Char){
		if(number == "0") number = digit.toString()
		else number += digit
	}

	fun addDelim(){
		number += "."
	}

	fun delete(){
		number = number.dropLast(1)
	}

	fun clear(){
		number = "0"
	}

	fun number() = number
}