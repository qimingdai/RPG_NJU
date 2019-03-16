//package games.monster.factory;
//
//import games.monster.Monster;
//import games.monster.builder.PhysicMonsterBuilder;
//
//public class PhysicMonsterFactory implements MonsterFactory {
//    @Override
//    public Monster createOrdinaryMonster(int level) {
//        Monster om = PhysicMonsterBuilder.create()
//                .buildrarity(0)
//                .buildSkills()
//                .buildExpValue(level)
//                .buildExpValue(level)
//                .createDefaultPhysicMonster(level);
//        return om;
//    }
//
//    @Override
//    public Monster createRareMonster(int level) {
//        Monster rm = PhysicMonsterBuilder.create()
//                .buildrarity(1)
//                .buildSkills()
//                .buildExpValue(level)
//                .buildEquipmentsValues(level)
//                .createDefaultPhysicMonster(level);
//        return rm;
//    }
//
//    @Override
//    public Monster createBossMonster(int level) {
//        Monster bm = PhysicMonsterBuilder.create()
//                .buildrarity(2)
//                .buildSkills()
//                .buildExpValue(level)
//                .buildEquipmentsValues(level)
//                .createDefaultPhysicMonster(level);
//        return bm;
//    }
//}
