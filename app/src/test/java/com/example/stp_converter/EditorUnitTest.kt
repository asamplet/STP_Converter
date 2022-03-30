package com.example.stp_converter

import com.example.stp_converter.converter.Convert10p
import com.example.stp_converter.converter.Editor
import org.junit.Assert
import org.junit.Test

class EditorUnitTest {

	@Test
	fun addDigitTest(){
		val num = Editor()
		num.addDigit('A')
		num.addDigit('1')
		val expect = "A1"

		Assert.assertEquals(expect, num.number())
	}

	@Test
	fun addDelimTest(){
		val num = Editor()
		num.addDigit('A')
		num.addDelim()
		num.addDigit('1')
		val expect = "A.1"

		Assert.assertEquals(expect, num.number())
	}

	@Test
	fun deleteTest(){
		val num = Editor()
		num.addDigit('A')
		num.addDigit('1')
		num.delete()
		val expect = "A"

		Assert.assertEquals(expect, num.number())
	}

	@Test
	fun clearTest(){
		val num = Editor()
		num.addDigit('A')
		num.addDigit('1')
		num.clear()
		val expect = "0"

		Assert.assertEquals(expect, num.number())
	}
}