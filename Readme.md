## 엑셀 API 

- 마주한 오류
  - python3 이름 python 으로 해놓아서 오차
  - 2차 위기 파이썬 라이브러리 호출 문제.. <- 파이썬은 가상환경에서 라이브로리를 관리한다고해서 그냥 맥 차제에 라이브러리 설치
    ModuleNotFoundError: No module named 'pandas' 에러는 Java에서 Python을 호출할 때, Python 인터프리터가 pandas 모듈을 찾지 못해서 발생하는 오류입니다. 이 오류의 주요 원인은 다음과 같습니다:

Python 환경에 pandas가 설치되어 있지 않음: Java에서 Python을 호출할 때, 해당 Python 인터프리터에 pandas 라이브러리가 설치되어 있어야 합니다. pandas를 설치하지 않은 경우 이 오류가 발생합니다.
Java에서 사용하는 Python 인터프리터와 별도의 가상환경 또는 다른 Python 환경이 있는 경우: Java 코드에서 호출하는 Python 인터프리터와 실제로 pandas를 설치한 Python 환경이 다른 경우, 모듈을 찾지 못하게 됩니다. 이는 가상환경(Virtual Environment) 등으로 분리된 개별적인 Python 환경을 사용하는 경우 자주 발생합니다.
