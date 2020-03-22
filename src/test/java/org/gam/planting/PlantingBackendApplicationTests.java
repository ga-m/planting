package org.gam.planting;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.gam.planting.jpa.entity.Achieve;
import org.gam.planting.jpa.entity.Goal;
import org.gam.planting.jpa.entity.LevelBasic;
import org.gam.planting.jpa.entity.Member;
import org.gam.planting.jpa.repository.AchieveRepository;
import org.gam.planting.jpa.repository.GoalRepository;
import org.gam.planting.jpa.repository.LevelBasicRepository;
import org.gam.planting.jpa.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlantingApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private AchieveRepository achieveRepository;

	@Autowired
	private GoalRepository goalRepository;

	@Autowired
	private LevelBasicRepository levelBasicRepository;

	@Test
	void createGoalWithArchiveAndLevelBasic() throws JsonProcessingException {
		// get Specific Member
		Member member = memberRepository.findById(1L).get();
		System.out.println(member);

		// get Goals of member
		List<Goal> goals = goalRepository.findByMemberId(member.getId());
		System.out.println(goals);

		// get Archives of goals
		// HashMap<Goal, HashMap<Achieve, Level>> tiles;
		/*
		 * Map<Student, Double> studentToGPA
		 * students.stream().collect(toMap(Functions.identity(), student ->
		 * computeGPA(student)));
		 */
		Map<Goal, Map<Achieve, LevelBasic>> tileMap = 
					goals
					.stream()
					.collect(
						Collectors.toMap(
							Function.identity(),
							goal -> achieveRepository.findByGoalIdOrderByCreateTimestamp(goal.getId())
								.stream()
								.collect(
									Collectors.toMap(
										Function.identity(), 
										achieve -> levelBasicRepository.findByGoalIdAndSeq(goal.getId(), 1L)
									)
								)
						)
					)
					;
		System.out.println(tileMap);

		ObjectMapper mapper = new ObjectMapper();

		String json = mapper.writeValueAsString(tileMap);
		System.out.println(json); // compact-print
		json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tileMap);
		System.out.println(json); // pretty-print

	}

}
