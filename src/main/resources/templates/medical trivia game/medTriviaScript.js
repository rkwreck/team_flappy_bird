const question = document.querySelector('#question');
const choices = Array.from(document.querySelectorAll('.choice-text'));
const progressText = document.querySelector('#progressText');
const scoreText = document.querySelector('#score');
const progressBarFull = document.querySelector('#progressBarFull');

let currentQuestion = {}
let acceptingAnswers = true
let score = 0
let questionCounter = 0
let availableQuestions = []

let questions = [
    {
        question: 'What is something you should NOT do when someone is having a cardiac or breathing emergency?',
        choice1: 'perform CPR',
        choice2: 'call 911',
        choice3: 'stand there and watch',
        choice4: 'scream for help',
        answer: 3,
    },
    {
        question: 'Fainting is a brief loss of consciousness. Why does it occurr',
        choice1: 'drop in blood flow to the brain',
        choice2: 'heat or dehydration',
        choice3: 'standing up too quickly',
        choice4: 'all of the above',
        answer: 4,
    },
    {
        question: 'Which of the following can NOT happen before someone is about to faint?',
        choice1: 'lose muscle control',
        choice2: 'tunnel vision or noises fading into background',
        choice3: 'feel weak, sweaty, or nauseated',
        choice4: 'increased color in their face',
        answer: 4,
    },
    {
        question: 'Which of these is a symptom of a heart attack?',
        choice1: 'discomfort in one or both arms, back, neck, jaw, or stomach',
        choice2: 'shortness of breath',
        choice3: 'cold sweat, dizziness, feeling light-headed',
        choice4: 'all of the above',
        answer: 4,
    },
    {
        question: 'Which of these is a warning sign of a stroke?',
        choice1: 'sudden, severe headache with no known cuase',
        choice2: 'sudden confusion, trouble speaking or understanding',
        choice3: 'a & b',
        choice4: 'none of the above',
        answer: 3,
    },
    {
        question: 'What is sudden cardiac arrest?',
        choice1: 'the abrupt loss of heart function/breathing/conscioussness',
        choice2: 'sudden blood loss to the brain',
        choice3: 'dizziness',
        choice4: 'none of the above',
        answer: 1,
    },
    {
        question: 'Select the answer choice that correctly lists two symptoms of cardiac arrest.',
        choice1: 'sudden collapse & shortness of breath',
        choice2: 'dizziness & shortness of breath',
        choice3: 'sudden collapse & dizziness',
        choice4: 'tumors & dizziness',
        answer: 1,
    },
    {
        question: 'What is vertigo?',
        choice1: 'when is a person feels like they or the world are actually spinning',
        choice2: 'when a person suddenly loses consciousness',
        choice3: "when the blood to a person's heart is suddenly blocked" ,
        choice4: 'all of the above',
        answer: 1,
    },
    {
        question: 'Central vertigo is caused by a problem in the brain. Which of the following is a cause of central vertigo?',
        choice1: 'blood vessel disease',
        choice2: 'tumors (cancerous or noncancerous',
        choice3: 'a & b',
        choice4: 'none of the above',
        answer: 3,
    },
]

const SCORE_POINTS = 100;
const MAX_QUESTIONS = 4;

startGame = () => {
    questionCounter = 0;
    score = 0;
    availableQuestions = [...questions];
    getNewQuestion();
}

getNewQuestion = () => {
    if (availableQuestions.length === 0 || questionCounter > MAX_QUESTIONS) {
        localStorage.setItem('mostRecentScore', score)

        return window.location.assign('/end.html');
    }

    questionCounter++
    progressText.innerText = 'Question ${questionCounter} of ${MAX_QUESTIONS}'
    progressBarFull.style.width = '${(questionCounter/MAX_QUESTIONS) * 100}%'

    const questionsIndex = Math.floor(Math.random() * availableQuestions.length)
    currentQuestion = availableQuestions[questionsIndex]
    questions.innerText = currentQuestion.question

    choices.forEach(choice => {
        const number = choice.dataset['number']
        choice.innerText = currentQuestion['choice' + number]
    })

    availableQuestions.splice(questionsIndex, 1)

    acceptingAnswers = true;
}

choices.forEach(choice => {
    choice.addEventListener('click', e =>{
        if (!acceptingAnswers) return

        acceptingAnswers = false
        const selectedChoice = e.target
        const selectedAnswer = selectedChoice.dataset['number']

        let classToApply = selectedAnswer == currentQuestion.answer ? 'correct' : 'incorrect'

        if(classToApply === 'correct') {
            incrementScore(SCORE_POINTS);
        }

        selectedChoice.parentElement.classList.add(classToApply)

        setTimeout(() => {
            selectedChoice.parentElement.classList.remove(classToApply)
            getNewQuestion()

        }, 1000)

    })
})

incrementScore = num => {
    score += num
    scoreText.innerText = score;
}

startGame()