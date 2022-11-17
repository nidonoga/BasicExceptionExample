package com.nidonoga.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nidonoga.math.SimpleMath;
import com.nidonoga.utils.NumberUtils;

@RestController
public class CalculatorController {

	private SimpleMath simpleMath = new SimpleMath();

	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		NumberUtils.validateParams(numberOne, numberTwo);
		return simpleMath.sum(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		NumberUtils.validateParams(numberOne, numberTwo);
		return simpleMath.subtraction(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		NumberUtils.validateParams(numberOne, numberTwo);
		return simpleMath.multiplication(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/average/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		NumberUtils.validateParams(numberOne, numberTwo);
		return simpleMath.average(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		NumberUtils.validateParams(numberOne, numberTwo);
		return simpleMath.division(NumberUtils.convertToDouble(numberOne), NumberUtils.convertToDouble(numberTwo));
	}

	@RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("number") String number) throws Exception {
		NumberUtils.validateParams(number);
		return simpleMath.squareRoot(NumberUtils.convertToDouble(number));
	}

}
