package ex09;

import java.util.ArrayList;
import java.util.List;

public class SkillSet {
    private List<Skill> skills;

    public SkillSet(){
        skills = new ArrayList<>();
    }

    public void addSkill(Skill skill){
        if(!skills.contains(skill))
            skills.add(skill);
    }

    public boolean hasSkill(Skill skill){
        if(skills.contains(skill))
            return true;
        return false;
    }

    public List<Skill> getSkills(){
        return skills;
    }
}
