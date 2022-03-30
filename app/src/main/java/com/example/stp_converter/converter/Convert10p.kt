package com.example.stp_converter.converter

import kotlin.math.abs

class Convert10p {

	fun dval(number: String, degree: Int) : Double {
		var num = 0.0
		var minus = 1

		var degree1 = degree
		var degree2 = 1.0

		for(ch in number){
			when (ch) {
				'-'  -> minus = -1
				'.'  -> {
					degree1 = 1
					degree2 = 1.0/degree
				}
				else -> num = num*degree1.toDouble() + charToInt(ch).toDouble()*degree2
			}
			if(degree2 != 1.0 && ch != '.') degree2 *= 1.0/degree
		}
		return minus*num
	}

	fun doConvert(number: Double, degree: Int, accuracy: Int) =
		intToP(number.toInt(), degree) + "." + fltToP(abs(number % 1), degree, accuracy)

	fun intToP(number: Int, p: Int) : String{
		var a = ""
		var minus = ""
		var num = number
		if(number<0){
			minus = "-"
			num*=-1
		}
		while(num>0){
			a = intToChar(num%p) + a
			num /= p
		}
		return minus+a
	}

	fun fltToP(number: Double, p: Int, c: Int) : String{
		var a = ""
		var i = c
		var num = number
		while(i>0){
			a += intToChar((num*p).toInt())
			num *= p
			num %= 1
			i--
		}
		return a
	}

	private fun charToInt(number: Char) : Int =
		when(number){
			'0' -> 0
			'1' -> 1
			'2' -> 2
			'3' -> 3
			'4' -> 4
			'5' -> 5
			'6' -> 6
			'7' -> 7
			'8' -> 8
			'9' -> 9
			'A' -> 10
			'B' -> 11
			'C' -> 12
			'D' -> 13
			'E' -> 14
			'F' -> 15
			else -> -1
		}

	private fun intToChar(number: Int) =
		when(number){
			0 -> '0'
			1 -> '1'
			2 -> '2'
			3 -> '3'
			4 -> '4'
			5 -> '5'
			6 -> '6'
			7 -> '7'
			8 -> '8'
			9 -> '9'
			10 -> 'A'
			11 -> 'B'
			12 -> 'C'
			13 -> 'D'
			14 -> 'E'
			15 -> 'F'
			else -> '-'
		}
}