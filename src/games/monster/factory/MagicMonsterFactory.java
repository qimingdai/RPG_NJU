//package games.monster.factory;
//
//import games.monster.Monster;
//import games.monster.builder.MagicMonsterBuilder;
//
//public class MagicMonsterFactory implements MonsterFactory{
//    @Override
//    public Monster createOrdinaryMonster(int level) {
//        Monster om = MagicMonsterBuilder.create()
//                .buildrarity(0)
//                .buildSkills()
//                .buildExpValue(level)
//                .buildEquipmentsValues(level)
//                .createDefaultMonster(level);
//        return om;
//    }
//
//    @Override
//    public Monster createRareMonster(int level) {
//        Monster rm = MagicMonsterBuilder.create()
//                .buildrarity(1)
//                .buildSkills()
//                .buildExpValue(level)
//                .buildEquipmentsValues(level)
//                .createDefaultMonster(level);
//        return rm;
//    }
//
//    @Override
//    public Monster createBossMonster(int level) {
//        Monster bm = MagicMonsterBuilder.create()
//                .buildrarity(2)
//                .buildSkills()
//                .buildExpValue(level)
//                .buildEquipmentsValues(level)
//                .createDefaultMonster(level);
//        return bm;
//    }
//}
