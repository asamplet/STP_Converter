package com.example.stp_converter

import com.example.stp_converter.converter.Convert10p
import org.junit.Assert
import org.junit.Test

class Convert10pUnitTest {

	@Test
	fun intToPTest1(){
		val c10p = Convert10p()
		val expect = "3039"
		Assert.assertEquals(expect, c10p.intToP(12345, 16))
	}

	@Test
	fun fltToPTest1(){
		val c10p = Convert10p()
		val expect = "0100"
		Assert.assertEquals(expect, c10p.fltToP(0.25, 2, 4))
	}

	@Test
	fun doConvertTest1(){
		val c10p = Convert10p()
		val expect = "-11.E00"
		Assert.assertEquals(expect, c10p.doConvert(-17.875, 16, 3))
	}

	@Test
	fun dvalTest1(){
		val c10p = Convert10p()
		val expect = -161.875
		Assert.assertEquals(expect, c10p.dval("-A1.E", 16), 1.0)
	}
}