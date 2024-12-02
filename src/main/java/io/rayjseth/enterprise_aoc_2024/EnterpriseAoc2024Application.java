package io.rayjseth.enterprise_aoc_2024;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.rayjseth.enterprise_aoc_2024.solvers.Day1Solver;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EnterpriseAoc2024Application {

	private final Day1Solver day1Solver;

	@Autowired
	public EnterpriseAoc2024Application(Day1Solver day1Solver) {
		this.day1Solver = day1Solver;
	}

	public static void main(String[] args) {
		SpringApplication.run(EnterpriseAoc2024Application.class, args);

	}

	@PostConstruct
	public void init() {
		this.day1Solver.solvePart1();
	}
}
