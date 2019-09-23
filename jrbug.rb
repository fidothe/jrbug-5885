require 'java'
require 'pathname'

$CLASSPATH << Pathname.new(__dir__).join('jrbug/target/jrbug-1.0-SNAPSHOT.jar').to_s

module JrbugCheck
  include_package 'io.werkstatt.jrbug'
end

failed = false

begin
  Java::IoWerkstattJrbug::ExampleConcrete.new.setInitialMode
rescue Exception => e
  p e
  failed = true
end

begin
  JrbugCheck::ExampleConcrete.new.setInitialMode
rescue Exception => e
  p e
  failed = true
end

exit 1 if failed