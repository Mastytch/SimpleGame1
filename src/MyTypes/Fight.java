package MyTypes;
public class Fight {

    Player p1 = new Player();
    Enemy e1 = new Enemy();

    int gtchs = p1.getChoice();
    public String Fight(int a){
        String b = null;
        if(a == 1 & gtchs == 1){
            b = "С криком: «Апорт!» вы кидаете палку на лестничную площадку.\n" +
                    " Собака радостно уносится вслед за палкой, но тут же\n" +
                    " возвращается с ней в зубах, радостно виляя обрубком хвоста.\n" +
                    " Похоже, у вас появился друг! Миссия пройдена!";
        }
        else if(a == 1 & gtchs == 2){
            b = "С возгласом: «Ням-ням», вы протягиваете кусок колбасы собаке.\n" +
                    " Последнее, что вам запомнилось - нечеловеческий рык,\n" +
                    " и налитые кровью глаза. Вы проиграли.";
        }
        else if(a == 1 & gtchs == 3){
            b = "Вы в недоумении вытягиваете руку с ножницами в сторону собаки,\n" +
                    " несколько раз ими клацнув. Собака, ожив по звуку ножниц вгрызается\n" +
                    " вам в руку, а, когда вы падаете, с видом победителя\n" +
                    " хватает вас за горло. Вы проиграли!";
        }
        else if(a == 2 & gtchs == 1){
            b = "Решив, что мулатке жарко и она как раз решила поужинать, вы протягиваете\n" +
                    " мулатке кусок колбасы. Девушка меняется в лице, теперь понятно,\n" +
                    " что она просто очень голодна! Умяв колбасу в секунду, девушка\n" +
                    " с благодарностью приживается к вам. Держи себя в руках.\n" +
                    " Держи себя в руках. Держи. Себя. В. Руках! Миссия пройдена!";
        }
        else if(a == 2 & gtchs == 2){
            b = "Стараясь, чтобы голос звучал властно, вы произносите «Рабыня! Пришел твой господин!»,\n" +
                    " хлопая палкой себя по раскрытой ладони. С истошным воплем мулатка бросается на вас,\n" +
                    " завороженного покачивающимися прелестями мулатки. Сковородка опускается вам на\n" +
                    " голову со сверхзвуковой скоростью. Бум! Темнота. Вы проиграли!";
        }
        else if(a == 2 & gtchs == 3){
            b = "Закатывая рукава рубашки, как можно более мягко говорите:\n" +
                    " «Присаживайтесь, милочка, будем стричься». Достаете ножницы и,\n" +
                    " пытаясь не смотреть на буфера произносите: «Я опытный парикмахер!\n" +
                    " Ваши волосы в надежных руках. И не только они, хе-хе!».\n" +
                    " Перспектива стрижки явно не вдохновила мулатку. Нисколько не смущаясь своей наготы,\n" +
                    " она бросается на вас, умело орудуя сковородкой. Бум! Бум! Темнота. Вы проиграли!";
        }
        else if(a == 3 & gtchs == 1){
            b = "Трезво поразмыслив, вы приходите к выводу, что главная опасность\n" +
                    " кроется в ошейнике робота. Пользуясь его неподвижностью,\n" +
                    " вы подскакиваете и перехватываете ножницами один из шлейфов\n" +
                    " на ошейнике робота. Замерев на секунду, его лицо начинает\n" +
                    " светиться дружелюбностью. «Проходите», говорит робот. Миссия пройдена!";
        }
        else if(a == 3 & gtchs == 2){
            b = "Широко замахнувшись, бьете робота по голове палкой. Это не приносит\n" +
                    " ощутимого результата. Хотя, робот оживает, его лампочки-зрачки\n" +
                    " вспыхивают красным. Металлический возглас: «Тревога! Нарушитель! Уничтожить!»\n" +
                    " разносится по комнате. Робот с неожиданной прытью хватает вас за\n" +
                    " голову и сдавливает, будто пресс. Вы проиграли!";
        }
        else if(a == 3 & gtchs == 3){
            b = "«Роботы же кушают, правда?» - говорите вы, протягивая роботу кусок колбасы.\n" +
                    " О том, что это решение было в корне не верным, вы понимаете уже тогда,\n" +
                    " когда робот скрутил вас в бараний рог. Трещат позвонки,\n" +
                    " робот явно настроен вас убить. Вы проиграли!";
        }
        else b = "Некорректный ввод, Вы проиграли. Нужно быть более внимательным!";
        return b;
    }
}