package jkind.writers;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import jkind.processes.messages.InductiveCounterexampleMessage;
import jkind.solvers.Model;
import jkind.solvers.Value;

public class ConsoleWriter extends Writer {
	@Override
	public void begin() {
	}

	@Override
	public void end() {
	}

	private void writeLine() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@Override
	public void writeValid(List<String> props, int k, long elapsed) {
		writeLine();
		System.out.println("VALID PROPERTIES: " + props + " || K = " + k + " || Time = " + elapsed
				/ 1000.0);
		writeLine();
		System.out.println();
	}

	@Override
	public void writeInvalid(String prop, int k, Model model, long elapsed) {
		writeLine();
		System.out.println("INVALID PROPERTY: " + prop + " || K = " + k + " || Time = " + elapsed
				/ 1000.0);
		writeModel(k, BigInteger.ZERO, model);
	}

	@Override
	public void writeUnknown(List<String> props,
			Map<String, InductiveCounterexampleMessage> inductiveCounterexamples) {
		for (String prop : props) {
			InductiveCounterexampleMessage icm = inductiveCounterexamples.get(prop);
			if (icm == null) {
				continue;
			}
			writeModel(icm.k, icm.n, icm.model);
		}
	}

	private void writeModel(int k, BigInteger offset, Model model) {
		System.out.format("%25s %6s ", "", "Step");
		System.out.println();
		System.out.format("%-25s ", "variable");
		for (int i = 0; i < k; i++) {
			System.out.format("%6s ", i);
		}
		System.out.println();
		System.out.println();

		for (String fn : getRelevantFunctions(model.getFunctions())) {
			System.out.format("%-25s ", fn.substring(1));
			Map<BigInteger, Value> fnMap = model.getFunction(fn);
			for (int i = 0; i < k; i++) {
				Value value = fnMap.get(BigInteger.valueOf(i).add(offset));
				System.out.format("%6s ", value != null ? value : "-");
			}
			System.out.println();
		}

		writeLine();
		System.out.println();
	}
}
